
  package gen;
  public class J_Gen178 {
  		@com.google.inject.Inject
  		public J_Gen178(J_Gen179 j_gen179){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + j_gen179 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  