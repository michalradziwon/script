
  package gen;
  public class H_Gen98 {
  		@com.google.inject.Inject
  		public H_Gen98(H_Gen99 h_gen99){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + h_gen99 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  