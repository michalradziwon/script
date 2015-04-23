
  package gen;
  public class F_Gen144 {
  		@com.google.inject.Inject
  		public F_Gen144(F_Gen145 f_gen145){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + f_gen145 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  