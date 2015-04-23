
  package gen;
  public class D_Gen11 {
  		@com.google.inject.Inject
  		public D_Gen11(D_Gen12 d_gen12){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + d_gen12 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  