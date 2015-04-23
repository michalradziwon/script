
  package gen;
  public class T_Gen104 {
  		@com.google.inject.Inject
  		public T_Gen104(T_Gen105 t_gen105){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + t_gen105 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  