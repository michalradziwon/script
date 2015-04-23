
  package gen;
  public class D_Gen149 {
  		@com.google.inject.Inject
  		public D_Gen149(D_Gen150 d_gen150){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + d_gen150 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  