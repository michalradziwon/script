
  package gen;
  public class F_Gen190 {
  		@com.google.inject.Inject
  		public F_Gen190(F_Gen191 f_gen191){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + f_gen191 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  