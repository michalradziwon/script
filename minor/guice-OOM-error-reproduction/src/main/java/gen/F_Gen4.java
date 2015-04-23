
  package gen;
  public class F_Gen4 {
  		@com.google.inject.Inject
  		public F_Gen4(F_Gen5 f_gen5){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + f_gen5 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  