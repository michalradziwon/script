
  package gen;
  public class O_Gen98 {
  		@com.google.inject.Inject
  		public O_Gen98(O_Gen99 o_gen99){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + o_gen99 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  