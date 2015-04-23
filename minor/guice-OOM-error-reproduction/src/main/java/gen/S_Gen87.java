
  package gen;
  public class S_Gen87 {
  		@com.google.inject.Inject
  		public S_Gen87(S_Gen88 s_gen88){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + s_gen88 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  