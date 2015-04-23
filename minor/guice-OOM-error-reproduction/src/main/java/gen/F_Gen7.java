
  package gen;
  public class F_Gen7 {
  		@com.google.inject.Inject
  		public F_Gen7(F_Gen8 f_gen8){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + f_gen8 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  