
  package gen;
  public class D_Gen188 {
  		@com.google.inject.Inject
  		public D_Gen188(D_Gen189 d_gen189){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + d_gen189 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  