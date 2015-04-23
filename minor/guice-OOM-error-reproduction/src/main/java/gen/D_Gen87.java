
  package gen;
  public class D_Gen87 {
  		@com.google.inject.Inject
  		public D_Gen87(D_Gen88 d_gen88){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + d_gen88 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  