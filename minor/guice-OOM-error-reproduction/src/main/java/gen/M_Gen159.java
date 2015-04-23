
  package gen;
  public class M_Gen159 {
  		@com.google.inject.Inject
  		public M_Gen159(M_Gen160 m_gen160){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + m_gen160 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  