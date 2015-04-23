
  package gen;
  public class T_Gen159 {
  		@com.google.inject.Inject
  		public T_Gen159(T_Gen160 t_gen160){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + t_gen160 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  