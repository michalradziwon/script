
  package gen;
  public class F_Gen157 {
  		@com.google.inject.Inject
  		public F_Gen157(F_Gen158 f_gen158){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + f_gen158 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  