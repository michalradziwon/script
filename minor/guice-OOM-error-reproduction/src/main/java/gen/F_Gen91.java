
  package gen;
  public class F_Gen91 {
  		@com.google.inject.Inject
  		public F_Gen91(F_Gen92 f_gen92){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + f_gen92 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  