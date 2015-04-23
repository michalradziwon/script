
  package gen;
  public class D_Gen142 {
  		@com.google.inject.Inject
  		public D_Gen142(D_Gen143 d_gen143){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + d_gen143 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  