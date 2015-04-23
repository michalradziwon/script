
  package gen;
  public class J_Gen14 {
  		@com.google.inject.Inject
  		public J_Gen14(J_Gen15 j_gen15){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + j_gen15 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  