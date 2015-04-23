
  package gen;
  public class J_Gen48 {
  		@com.google.inject.Inject
  		public J_Gen48(J_Gen49 j_gen49){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + j_gen49 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  