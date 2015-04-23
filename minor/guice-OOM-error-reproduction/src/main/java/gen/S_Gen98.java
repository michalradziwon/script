
  package gen;
  public class S_Gen98 {
  		@com.google.inject.Inject
  		public S_Gen98(S_Gen99 s_gen99){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + s_gen99 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  