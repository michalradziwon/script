
  package gen;
  public class Q_Gen101 {
  		@com.google.inject.Inject
  		public Q_Gen101(Q_Gen102 q_gen102){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + q_gen102 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  