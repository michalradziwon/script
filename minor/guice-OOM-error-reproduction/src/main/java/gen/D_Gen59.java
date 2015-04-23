
  package gen;
  public class D_Gen59 {
  		@com.google.inject.Inject
  		public D_Gen59(D_Gen60 d_gen60){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + d_gen60 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  