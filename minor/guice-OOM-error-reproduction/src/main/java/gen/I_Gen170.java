
  package gen;
  public class I_Gen170 {
  		@com.google.inject.Inject
  		public I_Gen170(I_Gen171 i_gen171){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + i_gen171 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  