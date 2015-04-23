
  package gen;
  public class F_Gen181 {
  		@com.google.inject.Inject
  		public F_Gen181(F_Gen182 f_gen182){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + f_gen182 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  