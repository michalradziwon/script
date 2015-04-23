
  package gen;
  public class F_Gen154 {
  		@com.google.inject.Inject
  		public F_Gen154(F_Gen155 f_gen155){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + f_gen155 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  