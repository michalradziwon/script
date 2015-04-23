
  package gen;
  public class F_Gen98 {
  		@com.google.inject.Inject
  		public F_Gen98(F_Gen99 f_gen99){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + f_gen99 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  