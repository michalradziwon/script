
  package gen;
  public class F_Gen111 {
  		@com.google.inject.Inject
  		public F_Gen111(F_Gen112 f_gen112){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + f_gen112 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  