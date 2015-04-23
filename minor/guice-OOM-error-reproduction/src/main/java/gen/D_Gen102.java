
  package gen;
  public class D_Gen102 {
  		@com.google.inject.Inject
  		public D_Gen102(D_Gen103 d_gen103){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + d_gen103 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  