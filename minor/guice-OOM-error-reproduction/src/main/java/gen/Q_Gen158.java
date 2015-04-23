
  package gen;
  public class Q_Gen158 {
  		@com.google.inject.Inject
  		public Q_Gen158(Q_Gen159 q_gen159){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + q_gen159 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  