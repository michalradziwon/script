
  package gen;
  public class J_Gen181 {
  		@com.google.inject.Inject
  		public J_Gen181(J_Gen182 j_gen182){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + j_gen182 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  