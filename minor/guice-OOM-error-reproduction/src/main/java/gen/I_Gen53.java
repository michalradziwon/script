
  package gen;
  public class I_Gen53 {
  		@com.google.inject.Inject
  		public I_Gen53(I_Gen54 i_gen54){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + i_gen54 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  