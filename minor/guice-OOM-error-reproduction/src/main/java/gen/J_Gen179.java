
  package gen;
  public class J_Gen179 {
  		@com.google.inject.Inject
  		public J_Gen179(J_Gen180 j_gen180){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + j_gen180 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  