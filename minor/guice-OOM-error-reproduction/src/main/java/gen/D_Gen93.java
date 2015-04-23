
  package gen;
  public class D_Gen93 {
  		@com.google.inject.Inject
  		public D_Gen93(D_Gen94 d_gen94){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + d_gen94 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  