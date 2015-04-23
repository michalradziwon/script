
  package gen;
  public class I_Gen124 {
  		@com.google.inject.Inject
  		public I_Gen124(I_Gen125 i_gen125){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + i_gen125 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  