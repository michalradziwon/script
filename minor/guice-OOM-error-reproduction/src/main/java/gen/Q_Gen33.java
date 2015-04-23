
  package gen;
  public class Q_Gen33 {
  		@com.google.inject.Inject
  		public Q_Gen33(Q_Gen34 q_gen34){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + q_gen34 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  