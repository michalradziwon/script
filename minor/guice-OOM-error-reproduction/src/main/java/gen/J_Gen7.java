
  package gen;
  public class J_Gen7 {
  		@com.google.inject.Inject
  		public J_Gen7(J_Gen8 j_gen8){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + j_gen8 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  