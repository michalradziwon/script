
  package gen;
  public class F_Gen99 {
  		@com.google.inject.Inject
  		public F_Gen99(F_Gen100 f_gen100){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + f_gen100 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  