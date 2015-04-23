
  package gen;
  public class D_Gen107 {
  		@com.google.inject.Inject
  		public D_Gen107(D_Gen108 d_gen108){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + d_gen108 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  