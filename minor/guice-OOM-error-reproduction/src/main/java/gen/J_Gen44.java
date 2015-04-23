
  package gen;
  public class J_Gen44 {
  		@com.google.inject.Inject
  		public J_Gen44(J_Gen45 j_gen45){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + j_gen45 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  