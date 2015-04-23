
  package gen;
  public class F_Gen176 {
  		@com.google.inject.Inject
  		public F_Gen176(F_Gen177 f_gen177){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + f_gen177 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  