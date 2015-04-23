
  package gen;
  public class D_Gen180 {
  		@com.google.inject.Inject
  		public D_Gen180(D_Gen181 d_gen181){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + d_gen181 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  