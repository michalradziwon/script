
  package gen;
  public class J_Gen98 {
  		@com.google.inject.Inject
  		public J_Gen98(J_Gen99 j_gen99){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + j_gen99 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  