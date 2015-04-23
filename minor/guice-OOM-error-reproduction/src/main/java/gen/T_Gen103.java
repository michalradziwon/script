
  package gen;
  public class T_Gen103 {
  		@com.google.inject.Inject
  		public T_Gen103(T_Gen104 t_gen104){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + t_gen104 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  