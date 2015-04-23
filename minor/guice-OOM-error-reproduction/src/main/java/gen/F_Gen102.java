
  package gen;
  public class F_Gen102 {
  		@com.google.inject.Inject
  		public F_Gen102(F_Gen103 f_gen103){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + f_gen103 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  