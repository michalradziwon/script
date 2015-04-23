
  package gen;
  public class J_Gen30 {
  		@com.google.inject.Inject
  		public J_Gen30(J_Gen31 j_gen31){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + j_gen31 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  