
  package gen;
  public class F_Gen56 {
  		@com.google.inject.Inject
  		public F_Gen56(F_Gen57 f_gen57){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + f_gen57 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  