
  package gen;
  public class T_Gen193 {
  		@com.google.inject.Inject
  		public T_Gen193(T_Gen194 t_gen194){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + t_gen194 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  