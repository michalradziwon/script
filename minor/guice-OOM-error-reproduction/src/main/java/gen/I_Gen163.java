
  package gen;
  public class I_Gen163 {
  		@com.google.inject.Inject
  		public I_Gen163(I_Gen164 i_gen164){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + i_gen164 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  