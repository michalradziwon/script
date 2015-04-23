
  package gen;
  public class D_Gen25 {
  		@com.google.inject.Inject
  		public D_Gen25(D_Gen26 d_gen26){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + d_gen26 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  