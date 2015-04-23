
  package gen;
  public class J_Gen4 {
  		@com.google.inject.Inject
  		public J_Gen4(J_Gen5 j_gen5){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + j_gen5 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  