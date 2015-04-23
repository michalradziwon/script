
  package gen;
  public class D_Gen19 {
  		@com.google.inject.Inject
  		public D_Gen19(D_Gen20 d_gen20){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + d_gen20 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  