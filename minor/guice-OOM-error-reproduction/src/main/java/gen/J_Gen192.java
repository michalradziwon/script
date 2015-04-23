
  package gen;
  public class J_Gen192 {
  		@com.google.inject.Inject
  		public J_Gen192(J_Gen193 j_gen193){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + j_gen193 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  