
  package gen;
  public class F_Gen70 {
  		@com.google.inject.Inject
  		public F_Gen70(F_Gen71 f_gen71){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + f_gen71 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  