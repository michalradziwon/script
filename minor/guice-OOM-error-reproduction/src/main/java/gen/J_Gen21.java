
  package gen;
  public class J_Gen21 {
  		@com.google.inject.Inject
  		public J_Gen21(J_Gen22 j_gen22){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + j_gen22 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  